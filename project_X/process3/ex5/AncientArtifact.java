package project_X.process3.ex5;

abstract class AncientArtifact {
    private final String name;

    AncientArtifact(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void describe();
}
