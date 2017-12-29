# ecrf
This file contains some basic information about the ecrf project.

This is a CRUD application which contains medical forms.
The term form corresponds to the main form e.g patient,IRM,Consultation while the create and edit forms are called sub-forms.

### Web Pages folder

    For every form there is a folder with the name of the form which contains 5 .xhtml files.
    The 3 first Create, Edit, View contain the respective sub-forms.
    List.xhtml contains the list of all objects of the respective form and the navigation buttons.
    index.xhtml is the main entry point and is used just for navigation purposes. 
    In index.xhtml we define which xtml files are included in this page.
    Patient-index.xhtml and Visit-index.xhtml are the only indexes currently used because only Patient and Visit forms contain nested forms and so navigation rules.
    
    
### Database connection
/src/main/setup/glassfish-resources.xml
    This is the file that determines the connection with the database. The server and credentials should be entered here. Glassfish server should be configured to use this file in order to setup the connection.


### Labels
/src/main/resources/MyBundle.prop
    This file contains most of the labels that are used in the app so it's easy to change them later without looking at the source code.
    Example 
    CreateBilanCognitifLbTitle_dateexamen=Date de l’examen means
    In the Create sub-form of the  BilanCognitifLb form the Title for the exam date field is Date de l’examen.
    
    All the other fields follow the same naming convention.


### Dependencies
    This is a maven project and the packaging configuration can be changed from the pom.xml file.
