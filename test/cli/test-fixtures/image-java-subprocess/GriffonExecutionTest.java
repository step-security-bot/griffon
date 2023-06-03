import java.io.IOException;

public class GriffonExecutionTest {

  public static void main(String[] args) {
    try {
      ProcessBuilder builder = new ProcessBuilder("griffon", "registry:busybox:latest", "-vv");

      builder.inheritIO();
      Process process = builder.start();

      process.waitFor();

    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }
  }
}
