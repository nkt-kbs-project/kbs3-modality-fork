// File managed by WebFX (DO NOT EDIT MANUALLY)

module modality.hotel.backoffice.activities.roomsgraphic {

    // Direct dependencies modules
    requires java.base;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires modality.base.backoffice.masterslave;
    requires modality.base.client.activity;
    requires modality.base.client.presentationmodel;
    requires modality.base.client.util;
    requires modality.base.shared.entities;
    requires modality.hotel.backoffice.operations.resourceconfiguration;
    requires webfx.extras.flexbox;
    requires webfx.extras.imagestore;
    requires webfx.extras.visual.controls.grid;
    requires webfx.framework.client.action;
    requires webfx.framework.client.activity;
    requires webfx.framework.client.operationaction;
    requires webfx.framework.client.orm.domainmodel.activity;
    requires webfx.framework.client.orm.reactive.entities;
    requires webfx.framework.client.orm.reactive.visual;
    requires webfx.framework.client.uirouter;
    requires webfx.framework.client.util;
    requires webfx.framework.shared.operation;
    requires webfx.framework.shared.orm.dql;
    requires webfx.framework.shared.orm.entity;
    requires webfx.framework.shared.router;
    requires webfx.kit.util;
    requires webfx.platform.util;
    requires webfx.stack.async;
    requires webfx.stack.com.serial;
    requires webfx.stack.db.datascope;
    requires webfx.stack.platform.json;
    requires webfx.stack.platform.windowhistory;

    // Exported packages
    exports org.modality_project.hotel.backoffice.activities.roomsgraphic;
    exports org.modality_project.hotel.backoffice.activities.roomsgraphic.routing;
    exports org.modality_project.hotel.backoffice.operations.routes.roomsgraphic;

    // Provided services
    provides dev.webfx.stack.framework.client.operations.route.RouteRequestEmitter with org.modality_project.hotel.backoffice.activities.roomsgraphic.RouteToRoomsGraphicRequestEmitter;
    provides dev.webfx.stack.framework.client.ui.uirouter.UiRoute with org.modality_project.hotel.backoffice.activities.roomsgraphic.RoomsGraphicUiRoute;

}