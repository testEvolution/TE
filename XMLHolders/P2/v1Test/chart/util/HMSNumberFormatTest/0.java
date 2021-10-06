@Test
    public void testGeneral() {
        HMSNumberFormat formatter = new HMSNumberFormat();
        assertEquals("00:00:00", formatter.format(0));
        assertEquals("00:00:59", formatter.format(59));
        assertEquals("00:01:01", formatter.format(61));
        assertEquals("00:59:59", formatter.format(3599));
        assertEquals("01:00:00", formatter.format(3600));
        assertEquals("01:00:01", formatter.format(3601));
    }
}