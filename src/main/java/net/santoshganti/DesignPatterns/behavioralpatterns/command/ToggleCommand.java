package net.santoshganti.DesignPatterns.behavioralpatterns.command;

public class ToggleCommand implements Command {
    private final Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.toggle();
    }
}
