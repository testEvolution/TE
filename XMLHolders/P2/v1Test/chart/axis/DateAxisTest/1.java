@Test
    public void testEquals() {

        DateAxis a1 = new DateAxis("Test");
        DateAxis a2 = new DateAxis("Test");
        assertTrue(a1.equals(a2));
        assertFalse(a1.equals(null));
        assertFalse(a1.equals("Some non-DateAxis object"));

        a1 = new DateAxis("Test", TimeZone.getTimeZone("PST"), Locale.US);
        assertFalse(a1.equals(a2));
        a2 = new DateAxis("Test", TimeZone.getTimeZone("PST"), Locale.US);
        assertTrue(a1.equals(a2));
        
        a1 = new DateAxis("Test", TimeZone.getTimeZone("PST"), Locale.FRANCE);
        assertFalse(a1.equals(a2));
        a2 = new DateAxis("Test", TimeZone.getTimeZone("PST"), Locale.FRANCE);
        assertTrue(a1.equals(a2));

        // tickUnit
        a1.setTickUnit(new DateTickUnit(DateTickUnitType.DAY, 7));
        assertFalse(a1.equals(a2));
        a2.setTickUnit(new DateTickUnit(DateTickUnitType.DAY, 7));
        assertTrue(a1.equals(a2));

        // dateFormatOverride
        a1.setDateFormatOverride(new SimpleDateFormat("yyyy"));
        assertFalse(a1.equals(a2));
        a2.setDateFormatOverride(new SimpleDateFormat("yyyy"));
        assertTrue(a1.equals(a2));

        // tickMarkPosition
        a1.setTickMarkPosition(DateTickMarkPosition.END);
        assertFalse(a1.equals(a2));
        a2.setTickMarkPosition(DateTickMarkPosition.END);
        assertTrue(a1.equals(a2));

    }

    