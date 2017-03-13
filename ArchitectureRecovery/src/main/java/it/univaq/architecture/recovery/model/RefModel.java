package it.univaq.architecture.recovery.model;


import java.io.Serializable;
import java.util.Date;

import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.PersonIdent;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevObject;
import org.eclipse.jgit.revwalk.RevTag;


/**
 * RefModel is a serializable model class that represents a tag or branch and
 * includes the referenced object.
 *
 * @author James Moger
 *
 */
public class RefModel implements Serializable, Comparable<RefModel> {

	private static final long serialVersionUID = 1L;
	public final String displayName;
	public final RevObject referencedObject;
	public transient Ref reference;

	public RefModel(String displayName, Ref ref, RevObject refObject) {
		this.displayName = displayName;
		this.reference = ref;
		this.referencedObject = refObject;
	}

	public Date getDate() {
		Date date = new Date(0);
		if (referencedObject != null) {
			if (referencedObject instanceof RevTag) {
				RevTag tag = (RevTag) referencedObject;
				PersonIdent tagger = tag.getTaggerIdent();
				if (tagger != null) {
					date = tagger.getWhen();
				}
			} else if (referencedObject instanceof RevCommit) {
				RevCommit commit = (RevCommit) referencedObject;
				PersonIdent committer = commit.getCommitterIdent();
				if (committer != null) {
					date = committer.getWhen();
				} else {
					date = getCommitDate(commit);
				}
			}
		}
		return date;
	}
	public static Date getCommitDate(RevCommit commit) {
		if (commit == null) {
			return new Date(0);
		}
		return new Date(commit.getCommitTime() * 1000L);
	}
	public String getName() {
		if (reference == null) {
			return displayName;
		}
		return reference.getName();
	}

	public int getReferencedObjectType() {
		int type = referencedObject.getType();
		if (referencedObject instanceof RevTag) {
			type = ((RevTag) referencedObject).getObject().getType();
		}
		return type;
	}

	public ObjectId getReferencedObjectId() {
		if (referencedObject instanceof RevTag) {
			return ((RevTag) referencedObject).getObject().getId();
		}
		return referencedObject.getId();
	}

	public String getShortMessage() {
		String message = "";
		if (referencedObject instanceof RevTag) {
			message = ((RevTag) referencedObject).getShortMessage();
		} else if (referencedObject instanceof RevCommit) {
			message = ((RevCommit) referencedObject).getShortMessage();
		}
		return message;
	}

	public String getFullMessage() {
		String message = "";
		if (referencedObject instanceof RevTag) {
			message = ((RevTag) referencedObject).getFullMessage();
		} else if (referencedObject instanceof RevCommit) {
			message = ((RevCommit) referencedObject).getFullMessage();
		}
		return message;
	}

	public PersonIdent getAuthorIdent() {
		if (referencedObject instanceof RevTag) {
			return ((RevTag) referencedObject).getTaggerIdent();
		} else if (referencedObject instanceof RevCommit) {
			return ((RevCommit) referencedObject).getAuthorIdent();
		}
		return null;
	}

	public ObjectId getObjectId() {
		return reference.getObjectId();
	}

	public boolean isAnnotatedTag() {
		if (referencedObject instanceof RevTag) {
			return !getReferencedObjectId().equals(getObjectId());
		}
		return reference.getPeeledObjectId() != null;
	}

	@Override
	public int hashCode() {
		return getReferencedObjectId().hashCode() + getName().hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof RefModel) {
			RefModel other = (RefModel) o;
			return getName().equals(other.getName());
		}
		return super.equals(o);
	}

	@Override
	public int compareTo(RefModel o) {
		return getDate().compareTo(o.getDate());
	}

	@Override
	public String toString() {
		return displayName;
	}
}