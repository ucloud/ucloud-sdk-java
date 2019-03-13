package cn.ucloud.udb.json;

import cn.ucloud.udb.model.ListMonitorItemsResult;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 11:37
 **/
public class AlarmRangeAdapter extends TypeAdapter<ListMonitorItemsResult.AlarmRange> {

    @Override
    public void write(JsonWriter out, ListMonitorItemsResult.AlarmRange value) throws IOException {
        if (value.getValue()!= null){
            out.value(value.getValue());
        }else {
            out.beginObject();
            out.name("min").value(value.getMin());
            out.name("max").value(value.getMax());
            out.endObject();
        }
    }

    @Override
    public ListMonitorItemsResult.AlarmRange read(JsonReader in) throws IOException {
        ListMonitorItemsResult.AlarmRange alarmRange = new ListMonitorItemsResult.AlarmRange();
        Boolean isString = false;
        try {
            String value = in.nextString();
            if (value != null) {
                alarmRange.setValue(value);
                isString = true;
            }
        }catch (Exception e){
        }
        if (!isString){
            in.beginObject();
            while (in.hasNext()) {
                if (!isString){
                    switch (in.nextName()){
                        case "min":
                            alarmRange.setMin(in.nextInt());
                            break;
                        case "max":
                            alarmRange.setMax(in.nextInt());
                            break;
                    }
                }
            }
            in.endObject();
        }
        return alarmRange;
    }
}
