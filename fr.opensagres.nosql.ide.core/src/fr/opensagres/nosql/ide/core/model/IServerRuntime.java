package fr.opensagres.nosql.ide.core.model;

import fr.opensagres.nosql.ide.core.extensions.IServerType;

public interface IServerRuntime extends IModelIdentity {

	IServerType getServerType();

	String getInstallDir();

	void setInstallDir(String installDir) throws Exception;

	void setName(String name);
}
