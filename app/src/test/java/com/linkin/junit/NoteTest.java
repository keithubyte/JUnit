package com.linkin.junit;

import com.linkin.junit.dao.NoteDAO;
import com.linkin.junit.impl.MockLoginImpl;
import com.linkin.junit.inter.Login;

import org.junit.Test;

/**
 * @author keith
 * @since 2016-03-08
 */
public class NoteTest {

    @Test
    public void testSaveNote() {
        Login login = new MockLoginImpl();
        NoteDAO noteDAO = new NoteDAO();
        noteDAO.saveNote(login.login("keith", "709394"), "Hello JUnite!");
    }

}
