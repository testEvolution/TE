@Test
    public void testSerialization() {
        DateTick t1 = new DateTick(new Date(0L), "Label", TextAnchor.CENTER,
                TextAnchor.CENTER, 10.0);
        DateTick t2 = (DateTick) TestUtils.serialised(t1);
        assertEquals(t1, t2);
    }

}