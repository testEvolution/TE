@Test
    public void testSerialization() {
        BoxAndWhiskerItem i1 = new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0,
                5.0, 6.0, 7.0, 8.0, new ArrayList<Double>());
        BoxAndWhiskerItem i2 = (BoxAndWhiskerItem) TestUtils.serialised(i1);
        assertEquals(i1, i2);
    }

}