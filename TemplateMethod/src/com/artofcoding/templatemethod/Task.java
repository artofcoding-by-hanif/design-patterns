package com.artofcoding.templatemethod;

public abstract class Task {
    AuditTrail auditTrail;

    protected abstract void deExecute();

    public Task() {
        auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();

        deExecute();
    }
}
