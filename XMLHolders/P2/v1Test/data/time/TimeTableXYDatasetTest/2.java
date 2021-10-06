@Test
    public void testEquals() {
        TimeTableXYDataset d1 = new TimeTableXYDataset();
        TimeTableXYDataset d2 = new TimeTableXYDataset();
        assertTrue(d1.equals(d2));
        assertTrue(d2.equals(d1));

        d1.add(new Year(1999), 123.4, "S1");
        assertFalse(d1.equals(d2));
        d2.add(new Year(1999), 123.4, "S1");
        assertTrue(d1.equals(d2));

        d1.setDomainIsPointsInTime(!d1.getDomainIsPointsInTime());
        assertFalse(d1.equals(d2));
        d2.setDomainIsPointsInTime(!d2.getDomainIsPointsInTime());
        assertTrue(d1.equals(d2));

        d1 = new TimeTableXYDataset(TimeZone.getTimeZone("GMT"));
        d2 = new TimeTableXYDataset(TimeZone.getTimeZone(
                "America/Los_Angeles"));
        assertFalse(d1.equals(d2));
    }

    