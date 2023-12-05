package com.mycompany.app;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import java.io.File;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        try {
            System.out.println("Cloning repository...");
            Git.cloneRepository()
                .setURI("https://github.com/nanophate-cci/cpu_load.git")
                .setDirectory(new File("tmp"))
                .call();
            System.out.println("Repository cloned!");
        } catch (GitAPIException e) {
            e.printStackTrace();
        }
    }
}
