@Test
    public void testEquals() {
        DateTickUnit t1 = new DateTickUnit(DateTickUnitType.DAY, 1);
        DateTickUnit t2 = new DateTickUnit(DateTickUnitType.DAY, 1);
        assertTrue(t1.equals(t2));
    }

    