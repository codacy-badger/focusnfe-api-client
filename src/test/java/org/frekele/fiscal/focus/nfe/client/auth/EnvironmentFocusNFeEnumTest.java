package org.frekele.fiscal.focus.nfe.client.auth;

import org.frekele.fiscal.focus.nfe.client.testng.InvokedMethodListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@Listeners(InvokedMethodListener.class)
public class EnvironmentFocusNFeEnumTest {

    @Test
    public void testNewInstance() throws Exception {
        EnvironmentFocusNFeEnum environment = EnvironmentFocusNFeEnum.fromValue("PRODUCTION");
        assertNotEquals(null, environment);
        environment = EnvironmentFocusNFeEnum.fromValue("HOMOLOGATION");
        assertNotEquals(null, environment);
        environment = EnvironmentFocusNFeEnum.fromValue(null);
        assertNull(environment);
        environment = EnvironmentFocusNFeEnum.fromValue("");
        assertNull(environment);
        environment = EnvironmentFocusNFeEnum.fromValue("XXXXXXXXXX");
        assertNull(environment);
    }

    @Test
    public void testGetAll() throws Exception {
        List<EnvironmentFocusNFeEnum> listAll = EnvironmentFocusNFeEnum.getAll();
        assertNotEquals(null, listAll);
        assertEquals(listAll.size(), 2);
        assertEquals(listAll.contains(EnvironmentFocusNFeEnum.PRODUCTION), true);
        assertEquals(listAll.contains(EnvironmentFocusNFeEnum.HOMOLOGATION), true);
    }
}
