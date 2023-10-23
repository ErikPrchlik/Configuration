package cz.mendelu.pef.configuration;

import java.util.List;

public interface ISectionDAO {
    void insertTask(Section section);
    void updateTask(Section section);
    void deleteTask(Section section);
    List<Section> getAllSection();
    Section getSectionByID(long id);
}
