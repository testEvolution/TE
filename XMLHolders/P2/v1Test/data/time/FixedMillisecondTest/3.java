@Test
    public void testImmutability() {
        Date d = new Date(20L);
        FixedMillisecond fm = new FixedMillisecond(d);
        d.setTime(22L);
        assertEquals(20L, fm.getFirstMillisecond());
    }
}