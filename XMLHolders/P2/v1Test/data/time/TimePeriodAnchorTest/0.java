@Test
    public void testEquals() {
        assertTrue(TimePeriodAnchor.START.equals(TimePeriodAnchor.START));
        assertTrue(TimePeriodAnchor.MIDDLE.equals(TimePeriodAnchor.MIDDLE));
        assertTrue(TimePeriodAnchor.END.equals(TimePeriodAnchor.END));
    }

    