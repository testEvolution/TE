@Test
    public void testSerialization() {
        StandardChartTheme t1 = new StandardChartTheme("Name");
        StandardChartTheme t2 = (StandardChartTheme) TestUtils.serialised(t1);
        assertTrue(t1.equals(t2));
    }

    