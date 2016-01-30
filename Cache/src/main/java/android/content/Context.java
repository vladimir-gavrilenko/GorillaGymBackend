package android.content;

import java.io.File;

public class Context {

    private File mDir;
    public static int MODE_PRIVATE = 1;

    public File getDir(String s, int i) {
        mDir = new File(s);
        // if the directory does not exist, create it
        if (!mDir.exists()) {
            System.out.println("creating directory: " + s);
            boolean result = false;

            try {
                result = mDir.mkdir();
            } catch(SecurityException se){
                //handle it
            }
            if(result) {
                System.out.println("DIR created");
            }
        }
        return mDir;
    }

    public File getCacheDir() {
        return mDir == null ? getDir("dualcache_", MODE_PRIVATE) : mDir;
    }
}
