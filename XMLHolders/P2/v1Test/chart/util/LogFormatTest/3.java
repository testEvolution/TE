@Test
    public void testSerialization() {
        LogFormat f1 = new LogFormat(10.0, "10", true);
        LogFormat f2 = (LogFormat) TestUtils.serialised(f1);
        assertEquals(f1, f2);
    }

}