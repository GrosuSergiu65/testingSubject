package interfaces.dataBaseFunctionality;

import java.util.ArrayList;
import java.util.List;

public interface ReadingContextFile {

    List<String> supplierNames1 = new ArrayList<>();

    void readData(String filePath);

    void readData();
}
