package com.company;

public class ProxyInternetAccess implements UIOfficeInternetAccess {
    private String _employeeName;
    private int _role;
    private RealInternetAccess  _realaccess;

    public ProxyInternetAccess(String _employeeName, int role) {
        this._employeeName = _employeeName;
        this._role = role;
    }

    @Override
    public void grantInternetAccess() {
        if (get_role(_employeeName) > 4)
        {
            _realaccess = new RealInternetAccess(_employeeName, _role);
            _realaccess.grantInternetAccess();
        }
        else
        {
            System.out.println("No Internet access granted. Your job level is below 5");
        }
    }

    public void set_role(int role){
        _role = role;
    }

    public int get_role(String emplName) {
        return _role;
    }
}
