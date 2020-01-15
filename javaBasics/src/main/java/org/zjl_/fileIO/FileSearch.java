package org.zjl_.fileIO;

import java.io.File;

public class FileSearch {

  public static void main(String[] args) {
    new FileSearch().getFiles("src/");
  }

  void getFiles(String path) {
    File file = new File(path);
    File[] files = file.listFiles();

      if (files == null)
          System.out.println(file + "目录错误");
      if (files.length == 0)
          System.out.println(file + "目录下无文件");

      for (File tempFile : files)
          if (tempFile.isDirectory()) {
              System.out.println(tempFile.getAbsolutePath());
              getFiles(tempFile.getAbsolutePath());
          } else {
              System.out.println(tempFile.getAbsolutePath());
          }
        /*File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".c")?true:false;
            }
        });*/
  }
}