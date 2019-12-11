package net.healthtechhub.capetowntourguide;

public class Location {
    private int mNameID;
    private int mAddressID;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Location object.
     *
     * @param name is the string resource ID for the name of the location
     * @param address is the string resource Id for the address of the location
     */
    public Location(int name, int address) {
        mNameID = name;
        mAddressID = address;
    }

    /**
     * Create a new Location object.
     *
     * @param name is the string resource ID for the name of the location
     * @param address is the string resource Id for the address of the location
     * @param imageResourceId is the drawable resource ID for the image associated with the location
     */
    public Location(int name, int address, int imageResourceId) {
        mNameID = name;
        mAddressID = address;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the location name.
     */
    public int getNameID() {
        return mNameID;
    }

    /**
     * Get the string resource ID for the location address.
     */
    public int getAddressID() {
        return mAddressID;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
