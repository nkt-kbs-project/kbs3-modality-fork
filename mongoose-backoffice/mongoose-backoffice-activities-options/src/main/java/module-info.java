// File managed by WebFX (DO NOT EDIT MANUALLY)

module mongoose.backoffice.activities.options {

    // Direct dependencies modules
    requires java.base;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires mongoose.backoffice.multilangeditor;
    requires mongoose.client.aggregates;
    requires mongoose.client.bookingcalendar;
    requires mongoose.client.businesslogic;
    requires mongoose.client.calendar;
    requires mongoose.client.icons;
    requires mongoose.frontoffice.activities.options;
    requires mongoose.shared.entities;
    requires mongoose.shared.time;
    requires webfx.extras.visual.controls.grid;
    requires webfx.framework.client.activity;
    requires webfx.framework.client.controls;
    requires webfx.framework.client.orm.domainmodel.activity;
    requires webfx.framework.client.orm.reactive.visual;
    requires webfx.framework.client.uirouter;
    requires webfx.framework.client.util;
    requires webfx.framework.shared.orm.dql;
    requires webfx.framework.shared.orm.entity;
    requires webfx.kit.util;
    requires webfx.platform.shared.submit;
    requires webfx.platform.shared.util;

    // Exported packages
    exports mongoose.backoffice.activities.options;

    // Provided services
    provides dev.webfx.framework.client.ui.uirouter.UiRoute with mongoose.backoffice.activities.options.EditableOptionsUiRoute;

}