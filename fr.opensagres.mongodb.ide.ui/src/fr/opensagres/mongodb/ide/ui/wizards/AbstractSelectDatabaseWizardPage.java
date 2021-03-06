package fr.opensagres.mongodb.ide.ui.wizards;

import java.util.Collections;

import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import fr.opensagres.mongodb.ide.core.model.Database;
import fr.opensagres.mongodb.ide.core.model.Server;
import fr.opensagres.mongodb.ide.ui.internal.Messages;
import fr.opensagres.mongodb.ide.ui.internal.Validator;
import fr.opensagres.mongodb.ide.ui.viewers.DatabaseContentProvider;
import fr.opensagres.mongodb.ide.ui.viewers.DatabaseLabelProvider;

public class AbstractSelectDatabaseWizardPage extends
		AbstractSelectServerWizardPage {

	private ComboViewer databaseViewer;

	public AbstractSelectDatabaseWizardPage(String pageName) {
		super(pageName);
	}

	@Override
	protected void createUIContent(Composite container) {
		// Create server
		super.createUIContent(container);

		// Display list of database.
		Label databaseLabel = new Label(container, SWT.NONE);
		databaseLabel.setText(Messages.database_label);
		databaseViewer = new ComboViewer(container, SWT.BORDER);
		databaseViewer.setLabelProvider(DatabaseLabelProvider.getInstance());
		databaseViewer
				.setContentProvider(DatabaseContentProvider.getInstance());
		databaseViewer.getControl().setLayoutData(
				new GridData(GridData.FILL_HORIZONTAL));
		databaseViewer.getCombo().addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				validate();
			}
		});

	}

	public Database getSelectedDatabase() {
		return databaseViewer.getSelection().isEmpty() ? null
				: (Database) ((IStructuredSelection) databaseViewer
						.getSelection()).getFirstElement();
	}

	public String getDatabaseName() {
		return databaseViewer.getCombo().getText();
	}

	@Override
	protected void onLoad() {
		super.onLoad();
		refreshDatabases();
		// display databases of the server
		Database database = getInitialDatabase();
		if (database != null) {
			databaseViewer.setSelection(new StructuredSelection(database));
		}
	}

	@Override
	protected void serverChanged() {
		super.serverChanged();
		refreshDatabases();
	}

	protected void refreshDatabases() {
		Server server = getSelectedServer();
		databaseViewer.setInput(server != null ? server.getChildren()
				: Collections.emptyList());
	}

	private Database getInitialDatabase() {
		return ((AbstractSelectNodeWizard) getWizard()).getInitialDatabase();
	}

	@Override
	protected boolean validateFields() {
		if (super.validateFields()) {
			// Database Name validation
			String databaseName = databaseViewer.getCombo().getText();
			return Validator.validateDatatabaseName(databaseName, this);
		}
		return false;
	}

}
