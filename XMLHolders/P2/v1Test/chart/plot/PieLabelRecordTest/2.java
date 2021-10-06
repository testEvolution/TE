@Test
    public void testSerialization() {
        PieLabelRecord p1 = new PieLabelRecord("A", 1.0, 2.0, new TextBox("B"),
                3.0, 4.0, 5.0);
        PieLabelRecord p2 = (PieLabelRecord) TestUtils.serialised(p1);
        boolean b = p1.equals(p2);
        assertTrue(b);
    }
}