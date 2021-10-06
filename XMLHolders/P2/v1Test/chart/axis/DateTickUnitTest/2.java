@Test
    public void testSerialization() {
        DateTickUnit a1 = new DateTickUnit(DateTickUnitType.DAY, 7);
        DateTickUnit a2 = (DateTickUnit) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

}