This file contains some basic information about the ecrf project.

The layout of the project folders is straightforward.
The term form corresponds to the main form e.g patient,IRM,Consultation while the create and edit forms are called sub-forms.

Web Pages folder

    For every form there is a folder with the name of the form which contains 5 .xhtml files.
    The 3 first Create, Edit, View contain the respective sub-forms.
    List.xhtml contains the list of all objects of the respective form and the navigation buttons.
    index.xhtml is the main entry point and is used just for navigation purposes. 
    In index.xhtml we define which xtml files are included in this page.
    Patient-index.xhtml and Visit-index.xhtml are the only indexes currently used because only Patient and Visit forms contain nested forms and so navigation rules.
    All the other forms are popup dialogs and all the necessary files (Create,Edit,View, List) are included in the main index.

#############################################################################################################################################################################################
Backend source files folder

    Now the source code is in just two basic packages

    gr.aueb.ecrf package

    This package contains the main part of the source code. 
    There are two basic classes and their extentions.

        AbstractFacade.java

                This is basically a DAO (Data Access Object).
                A DAO can be seen as a Facade for DB operations which mainly intends to hide the DB internals.
                Every form has it's own Facade class which extends AbstractFacade if the class wants to handle the database in a specific way. 


        AbstractController.java 

                This is the controller class which communicates with the pages and handles the requested actions.
                Actions that are shared between all forms are handled in this class.
                Every form extends this class in order to handle form-specific actions. 

        Converter and Validator Classes

                Every form has a class that implements the Converter interface.
                These classes are interfaces describing the respective form Java class that can perform Object-to-String and String-to-Object conversions between model data objects and a String representation of those objects that is suitable for rendering.
                There are also some custom converters that have not been integrated in the converter classes because they are common for all the forms regardless of the object.
                     maxminValidator.java:  limits the input range for various input form elements between a certain range that is given as input from the form.
                     maxminConverter.java:  converts the input of the numeric elements from text to numbers and vice versa. It also handles the "NA" case.
                     booleanConverter.java: converts from "true/false" to java boolean and vice versa.
                     sizeValidator.java:    checks the size of all patient ID fields(16 characters).

        Entity Classes.

                Every form has an entity class that describes the form as a java object.
                The names of these classes are just the names of the respective forms e.g Patient.java

        Login
                Login is handled by the classes Login.java LoginDAO.java. 
                The former is a managedBean that handles the login form request and the latter communicates with the database in order to verify the credentials.
                Navigation rules that force redirects to the login page and the appropriate checks of the outcome of the LoginDAO actions are in the WEB-INF/faces-config.xml and the AuthorizationFilter.java
                The username and password are session scoped and are handled during the session via SessionBean.java
    
    gr.aueb.utils package
        Contains some helper classes which are used to determine which controlled should be instantiated and handles the jsf  messages. 

#############################################################################################################################################################################################

Database connection
/src/main/setup/glassfish-resources.xml
    This is the file that determines the connection with the database. The server and credentials should be entered here. Glassfish server should be configured to use this file in order to setup the connection.

#############################################################################################################################################################################################

Labels
/src/main/resources/MyBundle.prop
    This file contains most of the labels that are used in the app so it's easy to change them later without looking at the source code.
    Example 
    CreateBilanCognitifLbTitle_dateexamen=Date de l’examen means
    In the Create sub-form of the  BilanCognitifLb form the Title for the exam date field is Date de l’examen.
    
    All the other fields follow the same naming convention.

#############################################################################################################################################################################################

Dependencies
    This is a maven project and the packaging configuration can be changed from the pom.xml file.