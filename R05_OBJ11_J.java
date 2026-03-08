/*
Rule: OBJ11-J
Be careful letting constructors throw exceptions
*/

public class R05_OBJ11_J {

    public R05_OBJ11_J(boolean valid) {

        if(!valid) {
            throw new IllegalArgumentException();
        }

    }

    public static R05_OBJ11_J create(boolean valid) {

        if(!valid) {
            return null;
        }

        return new R05_OBJ11_J(true);
    }

}
