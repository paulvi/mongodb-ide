package fr.opensagres.nosql.ide.ui.internal;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "fr.opensagres.nosql.ide.ui.internal.Messages";//$NON-NLS-1$

	public static String browseButton;
	public static String addButton;
	public static String editButton;
	public static String removeButton;

	// ****************** ServerLaunchConfigurationTab ******************

	public static String ServerLaunchConfigurationTab_name;

	// ****************** MongoRuntimePreferencePage ******************
	public static String ServerRuntimePreferencePage_title;
	public static String ServerRuntimePreferencePage_desc;
	public static String ServerRuntimePreferencePage_serverType;
	public static String InstalledRuntimesBlock_desc;
	public static String InstalledRuntimesBlock_nameColumn;
	public static String InstalledRuntimesBlock_installDirColumn;
	public static String InstalledRuntimesBlock_serverTypeColumn;

	// ****************** AddRuntimeDialog ******************
	public static String AddRuntimeDialog_title;
	public static String EditRuntimeDialog_title;
	public static String AddRuntimeDialog_desc;
	public static String AddRuntimeDialog_runtimeName;
	public static String AddRuntimeDialog_installDir;
	public static String AddRuntimeDialog_selectInstallDir;

	// MongodLaunchConfigurationTab
	public static String jobStarting;
	public static String jobRestarting;
	public static String jobStopping;
	public static String serverLaunchDescription;
	public static String serverLaunchServer;
	public static String serverLaunchHost;
	public static String serverLaunchRuntime;

	// Server Error
	public static String errorServerAlreadyRunning;
	public static String errorInvalidServer;
	public static String errorNoServerSelected;
	public static String errorStartFailed;
	public static String errorStartTimeout;
	public static String errorStopFailed;
	// Runtime error
	public static String errorRuntimeNameRequired;
	public static String errorInstallDirRequired;
	public static String errorInstallDir_baseDirNotExists;
	public static String errorInstallDir_baseDirNotDir;
	public static String errorInstallDir_binDirNotExists;
	public static String errorInstallDir_processFileNotExists;

	// ****************** RefreshAction ******************
	public static String RefreshAction_text;
	public static String RefreshAction_toolTipText;

	// ****************** DeleteAction ******************
	public static String DeleteAction_text;
	public static String DeleteAction_toolTipText;
	public static String DeleteAction_serverTitle;
	public static String DeleteAction_serverMessage;
	public static String DeleteAction_databaseTitle;
	public static String DeleteAction_databaseMessage;
	public static String DeleteAction_collectionTitle;
	public static String DeleteAction_collectionMessage;

	public static String actionNew;
	public static String actionStart;
	public static String actionStartToolTip;
	public static String actionStop;
	public static String actionStopToolTip;
	public static String actionRestart;
	public static String actionRestartToolTip;
	public static String actionUnlock;
	public static String actionUnlockToolTip;
	public static String actionOpen;

	// Editors
	public static String OverviewPage_title;
	public static String server_label;
	public static String database_label;
	public static String collection_label;
	public static String bucket_label;

	// ****************** New Action ******************
	public static String NewServerAction_text;
	public static String NewServerAction_toolTipText;
	public static String NewDatabaseAction_text;
	public static String NewDatabaseAction_toolTipText;
	public static String NewCollectionAction_text;
	public static String NewCollectionAction_toolTipText;
	public static String NewDocumentAction_text;
	public static String NewDocumentAction_toolTipText;

	// ****************** New Database Wizard ******************
	public static String NewDatabaseWizard_title;
	public static String NewDatabaseWizardPage_title;
	public static String NewDatabaseWizardPage_desc;
	public static String NewDatabaseWizardPage_openDatabaseEditorCheckbox_label;
	public static String NewDatabaseWizardPage_name_validation_exists;

	// ****************** New Collection Wizard ******************
	public static String NewCollectionWizard_title;
	public static String NewCollectionWizardPage_title;
	public static String NewCollectionWizardPage_desc;
	public static String NewCollectionWizardPage_openCollectionEditorCheckbox_label;

	// ****************** New Document Wizard ******************
	public static String NewDocumentWizard_title;
	public static String NewDocumentWizardPage_title;
	public static String NewDocumentWizardPage_desc;
	public static String NewDocumentWizardPage_openDocumentEditorCheckbox_label;
	
	// Validation
	public static String server_validation_required;
	public static String server_validation_notConnected;
	public static String database_validation_required;
	public static String collection_validation_required;
	
	static {
		// load message values from bundle file
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

}
