package hu.bme.mit.train.tachograph;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.time.LocalDateTime;

public class Tachograph {
    private Table<LocalDateTime, Integer, Integer>  table;
    public Tachograph()
    {
        table = HashBasedTable.create();
    }

    public int getSize()
    {
        return table.size();
    }

    public void addRow(LocalDateTime time, int joystickPosition, int referenceSpeed)
    {
        table.put(time, joystickPosition,referenceSpeed);
    }
}