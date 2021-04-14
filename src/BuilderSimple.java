/**
 * InnerSimpleBuilder show how a simple builder works.
 */

class InnerSimpleBuilder {

    int x, y, z;

    InnerSimpleBuilder() { // This is the builder.
        x = 10;
        y = 20;
        z = 30;
    }

}

public class BuilderSimple {

    public static void main(String[] args) {

        //Create a object with the buldier.
        InnerSimpleBuilder buildwithBuilder = new InnerSimpleBuilder();
        //Use the object with values created by the builder, you need to use dot.
        System.out.println(buildwithBuilder.x + buildwithBuilder.y + buildwithBuilder.z);

    }
}