@Test
    public void testSerialization() {
        AxisLocation location1 = AxisLocation.BOTTOM_OR_RIGHT;
        AxisLocation location2 = (AxisLocation) TestUtils.serialised(location1);
        assertEquals(location1, location2);
        boolean same = location1 == location2;
        assertEquals(true, same);
    }

}