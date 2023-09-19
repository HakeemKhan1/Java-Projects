/**
 * This class represents a container for manual contents, extending the ShipContainer class.
 * It allows storing and retrieving the contents of the manual.
 */
public class ManualContentList extends ShipContainer {

    private String contents;

    /**
     * Default constructor for creating an empty ManualContentList.
     */
    public ManualContentList() {

    }

    /**
     * Constructor for creating a ManualContentList with a specified ID.
     *
     * @param newID The ID to be assigned to the ManualContentList.
     */
    public ManualContentList(int newID) {

        containerID = newID;
    }

    /**
     * Sets the contents of the manual.
     *
     * @param contents The contents to be set for the manual.
     */
    public void setContents(String contents) {
        this.contents = contents;
    }

    /**
     * Retrieves the contents of the manual.
     *
     * @return The contents of the manual.
     */
    @Override
    public String containerContentList() {
        return contents;
    }
}
