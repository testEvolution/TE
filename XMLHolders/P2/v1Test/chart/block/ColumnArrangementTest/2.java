@Test
    public void testSerialization() {
        FlowArrangement f1 = new FlowArrangement(HorizontalAlignment.LEFT,
                VerticalAlignment.TOP, 1.0, 2.0);
        FlowArrangement f2 = (FlowArrangement) TestUtils.serialised(f1);
        assertEquals(f1, f2);
    }

}