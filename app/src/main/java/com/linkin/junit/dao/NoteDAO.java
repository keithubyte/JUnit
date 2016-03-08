package com.linkin.junit.dao;

/**
 * @author keith
 * @since 2016-03-08
 */
public class NoteDAO {

    public void saveNote(User user, String note) {
        if (user.id != null && !"".equals(user.id)) {
            System.out.println("Save note : " + note);
        }
    }

}
