@Test
    public void testHashCode() {
        DomainOrder d1 = DomainOrder.ASCENDING;
        DomainOrder d2 = DomainOrder.ASCENDING;
        assertTrue(d1.equals(d2));
        int h1 = d1.hashCode();
        int h2 = d2.hashCode();
        assertEquals(h1, h2);
    }

    