package fr.opensagres.nosql.ide.mongodb.ui.internal.editors.collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.PartInitException;

import fr.opensagres.nosql.ide.mongodb.core.model.Collection;
import fr.opensagres.nosql.ide.ui.editors.BasicModelFormEditor;

public class CollectionEditor extends
		BasicModelFormEditor<CollectionEditorInput, Collection> {

	public static final String ID = "fr.opensagres.nosql.ide.mongodb.ui.editors.collection.CollectionEditor";

	@Override
	protected void doAddPages() throws PartInitException {
		super.addPage(new OverviewPage(this));
		super.addPage(new DocumentsPage(this));
		super.addPage(new IndexesPage(this));
	}

	@Override
	protected String getOverridePartName() {
		// modify the title of the editor with collection name.
		Collection collection = getModelObject();
		if (collection != null) {
			return collection.getNameWithDB();
		}
		return null;
	}

	@Override
	protected void onSave(IProgressMonitor monitor) {

	}
}
