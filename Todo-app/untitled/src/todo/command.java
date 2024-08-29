package todo;



public class command {

    private String name;

    private String arg;



    public command(String name, String arg) {

        this.name = name;

        this.arg = arg;

    }



    public String getName() {

        return this.name;

    }



    public String getArg() {

        return this.arg;

    }



    public void setName(String name) {

        this.name = name;

    }



    public void setArg(String arg) {

        this.arg = arg;

    }



}
