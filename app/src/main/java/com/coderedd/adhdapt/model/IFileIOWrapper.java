package com.coderedd.adhdapt.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by CodeRedd on 3/15/2018.
 */

public interface IFileIOWrapper
{
    boolean fileExists( String name );
    void writeToFile( String name, String fileContents, int mode );
    String readFromFile( String name );
}
