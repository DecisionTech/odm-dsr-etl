# odm-dsr-etl (DRAFT)

## Overview
This repository provides an example of how to integrate ODM into an ETL type tranformation. It is  in (DRAFT) status as seen above. This status indicator will be removed after the example is tested. 

## Prerequisites
   * ODM Rule Desiger from IBM Passport Advantage
      * You can't use the one from [ODM on Cloud](https://www.bpm.ibmcloud.com/odm/index.html) or [ODM on Docker Hub](https://hub.docker.com/r/ibmcom/odm/) because neither gives you access to the rule engine jar file
   * Any [ETL Tool](https://en.wikipedia.org/wiki/Extract,_transform,_load) that can call custom Java
      * IBM InfoSphere DataStage
      * Informatica

## Steps

### Clone this code and import into Rule Designer
Clone this code either by using the eGit plugins for eclipse or by cloning the repository from the command line. 

Using eclipse, make sure you check the box to "Import all existing Eclipse projects after clone finishes" as seen below:
    <img width="526" alt="image" src="https://user-images.githubusercontent.com/18425410/57794206-c0d2e080-7708-11e9-9560-b4c8d7bd295b.png">

Here is the command line :
```
    git clone https://github.com/DecisionTech/odm-dsr-etl.git
```

If you use the command line, import the projects in Rule Designer by clicking on File | Import | Existing Projects into Workspace:

<img width="618" alt="image" src="https://user-images.githubusercontent.com/18425410/57794567-8c135900-7709-11e9-89d9-a4f78238b907.png">

### Validate that this sample can run in your environment
The first validation step is to confirm that the projects have been imported into the correct type of Rule Designer. If there are compile errors such as seen below, the Rule Designer client might be from [ODM on Cloud](https://www.bpm.ibmcloud.com/odm/index.html) or [ODM on Docker Hub](https://hub.docker.com/r/ibmcom/odm/):
<img width="618" alt="image" src="https://user-images.githubusercontent.com/18425410/57794934-689cde00-770a-11e9-9b4f-a65b2ef74ad3.png">

If things look error free, proceed to running the rules as-is. In the Rule Designer workspace while in Java Perspective, expand the JavaETLCLientForEmbeddedRES project folder, expand src, and expand javaetlclientforembeddedres. Now right click on ApplyRulesToETLTransaction.java file and select Run As | Java Application. If you are off to a good start, the console messages will look something like below:

<img width="958" alt="image" src="https://user-images.githubusercontent.com/18425410/57795316-4788bd00-770b-11e9-8df2-853e7ca07721.png">

If it did not work, post an issue here or email me. 

### Integrate the Sample Java into an ETL Java Plugin

...TBD...
