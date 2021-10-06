@Test
    public void testHashCode() {
        DateTickUnit t1 = new DateTickUnit(DateTickUnitType.DAY, 1);
        DateTickUnit t2 = new DateTickUnit(DateTickUnitType.DAY, 1);
        assertTrue(t1.equals(t2));
        int h1 = t1.hashCode();
        int h2 = t2.hashCode();
        assertEquals(h1, h2);
    }

    