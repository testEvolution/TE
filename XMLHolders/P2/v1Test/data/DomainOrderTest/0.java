@Test
    public void testEquals() {
        assertEquals(DomainOrder.NONE, DomainOrder.NONE);
        assertEquals(DomainOrder.ASCENDING, DomainOrder.ASCENDING);
        assertEquals(DomainOrder.DESCENDING, DomainOrder.DESCENDING);
        assertFalse(DomainOrder.NONE.equals(DomainOrder.ASCENDING));
        assertFalse(DomainOrder.NONE.equals(DomainOrder.DESCENDING));
        assertFalse(DomainOrder.NONE.equals(null));
        assertFalse(DomainOrder.ASCENDING.equals(DomainOrder.NONE));
        assertFalse(DomainOrder.ASCENDING.equals(DomainOrder.DESCENDING));
        assertFalse(DomainOrder.ASCENDING.equals(null));
        assertFalse(DomainOrder.DESCENDING.equals(DomainOrder.NONE));
        assertFalse(DomainOrder.DESCENDING.equals(DomainOrder.ASCENDING));
        assertFalse(DomainOrder.DESCENDING.equals(null));
    }

    