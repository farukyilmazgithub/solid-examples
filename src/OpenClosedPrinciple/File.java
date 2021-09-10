package OpenClosedPrinciple;

//follows principle
abstract class File
{
    public abstract void SaveToFile(File file);
}


/*

//doesn't follow the principle

public class FileDont
{
    public void SaveToFile(FileDont fileDont)
    {
        if (TypeOfFile == "txt"){}

        if (TypeOfFile == "xls"){}
    }
}

 */