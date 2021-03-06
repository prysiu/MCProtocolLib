package com.github.steveice10.mc.protocol.data.message;

public class ClickEvent implements Cloneable {
    private ClickAction action;
    private String value;

    public ClickEvent(ClickAction action, String value) {
        this.action = action;
        this.value = value;
    }

    public ClickAction getAction() {
        return this.action;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public ClickEvent clone() {
        return new ClickEvent(this.action, this.value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof ClickEvent && this.action == ((ClickEvent) o).action && this.value.equals(((ClickEvent) o).value);
    }

    @Override
    public int hashCode() {
        int result = this.action.hashCode();
        result = 31 * result + this.value.hashCode();
        return result;
    }
}
