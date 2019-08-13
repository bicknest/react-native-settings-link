using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Settings.Link.RNSettingsLink
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNSettingsLinkModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNSettingsLinkModule"/>.
        /// </summary>
        internal RNSettingsLinkModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNSettingsLink";
            }
        }
    }
}
