package KaminskiPictureFrame;

public class PictureData 
{
    //private variables
    private String fileName;
    private String date;
    private String description;

    //getters and setters
    public String getFileName()
    {
        return fileName;
    }

    public void setFileName(String text)
    {
        this.fileName = text;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String cal)
    {
        this.date = cal;
    }

    public String getDesc()
    {
        return description;
    }

    public void setDesc(String text)
    {
        this.description = text;
    }

    //constructor
    public PictureData(String fileName, String date, String description) 
    {
        setFileName(fileName);
        setDate(date);
        setDesc(description);
    }

    //default constructor
    public PictureData()
    {
        fileName = "file";
        date = "2021-12-4";
        description = "this is a picture";
    }

    //default toString function
    @Override
    public String toString()
    {
        return String.format("%s %s %s", fileName, date, description);
    }
}
