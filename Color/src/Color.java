
class InvalidColorException extends Exception 
{
    public InvalidColorException(String color) 
    {
        super("Invalid color name: " + color + ". Allowed colors are 'red', 'green', and 'white'.");
    }
}

// Color class
public class Color
{
    private String colorName;

    public Color(String colorName) throws InvalidColorException 
    {
        setColorName(colorName);
    }

    public String getColorName() 
    {
        return colorName;
    }

    public void setColorName(String colorName) throws InvalidColorException
    {
        if (!colorName.equalsIgnoreCase("red") && 
            !colorName.equalsIgnoreCase("green") && 
            !colorName.equalsIgnoreCase("white")) {
            throw new InvalidColorException(colorName);
        }
        this.colorName = colorName;
    }

    @Override
    public String toString() {
        return "Color: " + colorName;
    }

    public static void main(String[] args) {
        try {
            Color color1 = new Color("blue"); // This will raise an exception
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());
        }

        try {
            Color color2 = new Color("red");
            System.out.println(color2); // This will print: Color: red

            color2.setColorName("yellow"); // This will raise an exception
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());
        }

        try {
            Color color3 = new Color("green");
            System.out.println(color3); // This will print: Color: green
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());
        }
    }
}
