# MicroART
**MicroART-Tool** is the first prototype implementation of a more generic approach named **MicroART**.

The overall approach is presented in the [Towards Recovering the Software Architecture of Microservice-based Systems](http://www.ivanomalavolta.com/files/papers/AMS_2017.pdf) published at [1st International Workshop on Architecting with MicroServices, 2017](https://ams2017.github.io/). The [slides](https://www.slideshare.net/paolodifrancesco/towards-recovering-the-software-architecture-of-microservicebased-systems) of the approach are also available.

The details on the tools are presented in [MicroART: A Software Architecture Recovery Tool for Maintaining Microservice-based Systems](http://www.ivanomalavolta.com/files/papers/ICSA_2017_tool.pdf) published at [1st International Conference on Software Architecture (ICSA), Tool Papers,2017]. The [slides](https://www.slideshare.net/paolodifrancesco/microart-a-software-architecture-recovery-tool-for-maintaining-microservicebased-systems) of the tool are also available.


## Disclaimer 
**This software is published for academic and non-commercial use only.**

## Setup
The prototype has been tested in the following conditions.

### Environment

    Operative System Host Machine
    Linux Kubuntu 16.04
    Linux kernel version 4.4.0-31-generic
    Docker Client/ Server

### Client

    Version:      1.13.0
    API version:  1.25
    Go version:   go1.7.3
    Git commit:   49bf474
    Built:        Tue Jan 17 09:58:26 2017
    OS/Arch:      linux/amd64

### Server

    Version:      1.13.0
    API version:  1.25 (minimum version 1.12)
    Go version:   go1.7.3
    Git commit:   49bf474
    Built:        Tue Jan 17 09:58:26 2017
    OS/Arch:      linux/amd64
    Experimental: false

### Docker Machine
    docker-machine version 0.9.0, build 15fd4c7

### Docker Compose
    docker-compose version 1.10.0, build 4bd6f1

### Virtual Box version 5.0.32

## Development environment

### Eclipse version Neon .2 release 4.6.2

### Maven  Apache Maven 3.3.9

### Git version 2.7.4

### Nodejs version  4.2.6

### NPM version 3.5.2

### Java version  openjdk 1.8.0_121

==GUIDE

Docker

Docker Instalation:

    sudo apt-get update
    sudo apt-get install curl linux-image-extra-$(uname -r) linux-image-extra-virtual
    sudo apt-get install apt-transport-https ca-certificates
    curl -fsSL https://yum.dockerproject.org/gpg | sudo apt-key add -
    apt-key fingerprint 58118E89F3A912897C070ADBF76221572C52609D
    sudo apt-get install software-properties-common
    sudo add-apt-repository \
      "deb https://apt.dockerproject.org/repo/ \
      ubuntu-$(lsb_release -cs) \
      main"
    sudo apt-get update
    sudo apt-get -y install docker-engine
    apt-cache madison docker-engine

Choose a specific version to install. The second column is the <version_string>

In this project i used 1.13.0-0

    sudo apt-get -y install docker-engine=<VERSION_STRING>


Manage Docker as a non-root user

    sudo groupadd docker
    sudo usermod -aG docker $USER

May need a Log Off



Configure Docker to start on boot

    sudo systemctl enable docker

Docker-Machine

    curl -L https://github.com/docker/machine/releases/download/v0.9.0/docker-machine-`uname -s`-`uname -m` >/tmp/docker-machine &&
    chmod +x /tmp/docker-machine &&
    sudo cp /tmp/docker-machine /usr/local/bin/docker-machine
    docker-machine version
    
These two operations are not foundamental, execute these operation if a the end of the guide it doesn't

    docker-machine create --driver virtualbox default
    eval "$(docker-machine env default)"

Docker-compose

    curl -L "https://github.com/docker/compose/releases/download/1.10.0/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
    chmod +x /usr/local/bin/docker-compose

To check

    docker-compose --version

AcmeAIR

Our Case study will be AcmeAir a Node.js implementation of the Acme Air Sample Application. 
With datastore support of MongoDB, Cloudant, Cassandra. 
With runtime support of  Docker in order to have a  Micro-Services Architecture to Analyze

Building and Start

    git clone https://github.com/wasperf/acmeair-nodejs.git
    cd acmeair-nodejs
    npm install
    cd node_modules/.bin
    npm install
    cd ..
    
    docker network create --driver bridge my-net
    set NETWORK=my-net && export NETWORK=my-net 

Before build the Dockerfile is necessary a modification to all the Dockerfiles in the home. 
Substituting the first row whit this row
    
    FROM ibmcom/ibmnode
    
The Dockerfile build may take a while

    docker-compose build

The “up” command start the service in only one windows, in the terminal you will see some log of the startup of the application and some logs of communications

    docker-compose up

After 1~2 min all the services should be ready (the first startup take longer)

    Go to http:://127.0.0.1:80/main/acmeair

If this page doesn’t appear wait a bit more or come back to Docker-machine guide e type the two missing commands.


Now you can use the system, the Support Service is not working.


Eclipse and run app

Download Eclipse.

Define a workspace in this example in ~/EclipseWorkspace

Run it. 

The Application is in a Github. Clone the repository and copy inside the Eclipse workspace

    git clone https://github.com/microart/microART-Tool.git
    cd microART
To Run the recovery application:

    Open eclipse Neon.
    
    Set a Workspace.
    
    One Eclipse in opened
    
    Inside Eclipse neon go in the Project Explorer.
    
    Right-Click
    
    Import 
    
    Existing Maven Project
    
    Select the proper directory
    
    Wait until the maven building ends.
    
    Right-Click on the project -> Properties
    
    Click on Java Build Path
    
    Click on Add JAR
    
    Add the Jar inside the project, in src/main
    
    Finish
    
    To run just click Start on the top bar of Eclipse.
    
To run the presentation project:

    Download and start Eclipse Epsilon.
    
    Create a workspace
    
    Import, from General source all the project present in the directory PresentationProject
    
    Right Click on project called MinimalDSL, Run as an Eclipse Application
    
    Wait untile a new runtime eclipse istance is ready.
    
    Once the new eclipse istance started, in the workspace create before will be a runtime directory
    
    import from general source, the project into RunTime/runtime-EclipseApplication


