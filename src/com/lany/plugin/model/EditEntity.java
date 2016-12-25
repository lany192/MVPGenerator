package com.lany.plugin.model;

public class EditEntity {
    private String name;
    private String viewInterfaceName;
    private String presenterInterfaceName;
    private String presenterImplName;

    private String modelInterfaceName;
    private String modelImplName;

    private boolean createViewInterface = true;
    private boolean createPresenterInterface = true;
    private boolean createPresenterImpl = true;
    private boolean createModelInterface = true;
    private boolean createModelImpl = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getViewInterfaceName() {
        return viewInterfaceName;
    }

    public void setViewInterfaceName(String viewInterfaceName) {
        this.viewInterfaceName = viewInterfaceName;
    }

    public String getPresenterInterfaceName() {
        return presenterInterfaceName;
    }

    public void setPresenterInterfaceName(String presenterInterfaceName) {
        this.presenterInterfaceName = presenterInterfaceName;
    }

    public String getPresenterImplName() {
        return presenterImplName;
    }

    public void setPresenterImplName(String presenterImplName) {
        this.presenterImplName = presenterImplName;
    }

    public String getModelInterfaceName() {
        return modelInterfaceName;
    }

    public void setModelInterfaceName(String modelInterfaceName) {
        this.modelInterfaceName = modelInterfaceName;
    }

    public String getModelImplName() {
        return modelImplName;
    }

    public void setModelImplName(String modelImplName) {
        this.modelImplName = modelImplName;
    }

    public boolean isCreateViewInterface() {
        return createViewInterface;
    }

    public void setCreateViewInterface(boolean createViewInterface) {
        this.createViewInterface = createViewInterface;
    }

    public boolean isCreatePresenterInterface() {
        return createPresenterInterface;
    }

    public void setCreatePresenterInterface(boolean createPresenterInterface) {
        this.createPresenterInterface = createPresenterInterface;
    }

    public boolean isCreatePresenterImpl() {
        return createPresenterImpl;
    }

    public void setCreatePresenterImpl(boolean createPresenterImpl) {
        this.createPresenterImpl = createPresenterImpl;
    }

    public boolean isCreateModelInterface() {
        return createModelInterface;
    }

    public void setCreateModelInterface(boolean createModelInterface) {
        this.createModelInterface = createModelInterface;
    }

    public boolean isCreateModelImpl() {
        return createModelImpl;
    }

    public void setCreateModelImpl(boolean createModelImpl) {
        this.createModelImpl = createModelImpl;
    }
}
